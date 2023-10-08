package br.com.gestao_eventos.tccengsw_noplastic.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
@Slf4j
public class MapUtils {

    private final ModelMapper modelMapper;
    private final ObjectMapper objectMapper;

    private ModelMapper getModelMapper() {
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        return modelMapper;
    }

    public <T> Page<T> mapPage(@NotNull Page<?> page, Class<T> clazz) {
        return new PageImpl<>(mapPageToList(page, clazz),
                page.getPageable(),
                page.getTotalElements());
    }

    public <T> List<T> mapPageToList(@NotNull Page<?> page, Class<T> clazz) {
        return page
                .stream()
                .map(a -> getModelMapper().map(a, clazz))
                .collect(Collectors.toList());
    }

    public <T> List<T> mapListToList(@NotNull List<?> list, Class<T> clazz) {
        return list
                .stream()
                .map(a -> getModelMapper().map(a, clazz))
                .collect(Collectors.toList());
    }

    public <T> T mapObject(Object object, Class<T> clazz) {
        return getModelMapper().map(object, clazz);
    }

    public Object merge(Object source, Object target) {
        getModelMapper().map(source, target);
        return target;
    }

    public String toJson(@NotNull Object object) {
        try {
            return objectMapper.writeValueAsString(object);
        } catch (JsonProcessingException exception) {
            log.error("Erro ao converter o objeto {} em json: {}", object, exception.getMessage());
            return null;
        }
    }

}
