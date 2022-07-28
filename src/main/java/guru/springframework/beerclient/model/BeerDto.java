package guru.springframework.beerclient.model;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Null;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
public class BeerDto {
    @Null
    private UUID id;
    @NotBlank
    private String beerName;
    @NotBlank
    private String beerStyle;
    private String upc;
    private int quantityOnHand;
    private int version;
    private OffsetDateTime createdDate;
    private OffsetDateTime lastModifiedDate;
}
