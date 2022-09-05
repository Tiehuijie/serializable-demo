package serializableDemo.dto;

import lombok.Builder;

import java.io.Serializable;

@Builder
public class DogDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    public static String name = "teddy";
}
