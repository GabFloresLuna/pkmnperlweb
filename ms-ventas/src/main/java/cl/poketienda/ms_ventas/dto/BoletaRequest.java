// ms-ventas/src/main/java/cl/poketienda/ms_ventas/dto/BoletaRequest.java
package cl.poketienda.ms_ventas.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import java.util.List;

public record BoletaRequest(

        @NotBlank(message = "El nombre es obligatorio")
        @Size(max = 100, message = "El nombre no puede superar los 100 caracteres")
        String nombre,

        @NotBlank(message = "Los apellidos son obligatorios")
        @Size(max = 100, message = "Los apellidos no pueden superar los 100 caracteres")
        String apellidos,

        @NotBlank(message = "El correo es obligatorio")
        @Email(message = "El correo no tiene un formato válido")
        @Size(max = 100, message = "El correo no puede superar los 100 caracteres")
        String correo,

        @NotBlank(message = "La calle es obligatoria")
        @Size(max = 150, message = "La calle no puede superar los 150 caracteres")
        String calle,

        @Size(max = 50, message = "El departamento no puede superar los 50 caracteres")
        String departamento,

        @NotBlank(message = "La región es obligatoria")
        @Size(max = 100, message = "La región no puede superar los 100 caracteres")
        String region,

        @NotBlank(message = "La comuna es obligatoria")
        @Size(max = 100, message = "La comuna no puede superar los 100 caracteres")
        String comuna,

        @Size(max = 255, message = "Las indicaciones no pueden superar los 255 caracteres")
        String indicaciones,

        @NotEmpty(message = "Debe incluir al menos un producto")
        @Valid
        List<Item> items
) {

    public record Item(

            @NotNull(message = "El id del producto es obligatorio")
            Long productoId,

            @NotNull(message = "La cantidad es obligatoria")
            @Positive(message = "La cantidad debe ser mayor que 0")
            Integer cantidad
    ) {
    }
}