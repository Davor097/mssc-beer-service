package com.davor.msscbeerservice.web.mappers;

import com.davor.msscbeerservice.domain.Beer;
import com.davor.msscbeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {
	BeerDto beertoBeerDto(Beer beer);

	Beer beerDtoToBeer(BeerDto beerDto);
}
