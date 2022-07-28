package guru.springframework.beerclient.service;

import guru.springframework.beerclient.model.BeerDto;
import org.springframework.data.domain.Pageable;
import reactor.core.publisher.Mono;

public class BeerServiceImpl implements BeerService {
    @Override
    public Mono<BeerDto> add(BeerDto beerDto) {
        return null;
    }

    @Override
    public Mono<BeerDto> getById(String id) {
        return null;
    }

    @Override
    public Mono<Pageable> getAll(BeerDto beerDto) {
        return null;
    }

    @Override
    public Mono<BeerDto> getByUpc(String upc) {
        return null;
    }

    @Override
    public Mono<BeerDto> updateById(String id) {
        return null;
    }

    @Override
    public void deleteById(String id) {

    }
}
