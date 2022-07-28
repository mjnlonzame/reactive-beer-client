package guru.springframework.beerclient.service;

import guru.springframework.beerclient.model.BeerDto;
import org.springframework.data.domain.Pageable;
import reactor.core.publisher.Mono;

public interface BeerService {

    Mono<BeerDto> add(BeerDto beerDto);

    Mono<BeerDto> getById(String id);

    Mono<Pageable> getAll(BeerDto beerDto);

    Mono<BeerDto> getByUpc(String upc);

    Mono<BeerDto> updateById(String id);

    void deleteById(String id);
}
