package guru.springframework.beerclient.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class BeerDto {
    private String id;
    private String beerName;
    private String beerStyle;
    private String upc;
    private int quantityOnHand;
    private int version;
    private LocalDate createdDate;
    private LocalDate lastModifiedDate;
}
