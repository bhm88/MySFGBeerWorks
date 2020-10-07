package guru.springframework.sgfbrewery.services;

import guru.springframework.sgfbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);
}
