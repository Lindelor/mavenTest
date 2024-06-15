package com.lind.maven.test.datasupplier.mapper;

import com.lind.maven.test.datasupplier.dto.RandomDataDTO;
import com.lind.maven.test.datasupplier.model.RandomDataModel;
import org.mapstruct.*;

@Mapper(
        componentModel = MappingConstants.ComponentModel.SPRING,
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE
)
public abstract class RandomDataMapper {
    public abstract RandomDataDTO map(RandomDataModel randomDataModel);
}
