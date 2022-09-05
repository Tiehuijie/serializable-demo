package serializableDemo.dto;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import static org.assertj.core.api.Assertions.assertThat;

class DogDTOTest {
    @Test
    void should_get_dog_name_success_when_dog_has_serializable() throws IOException, ClassNotFoundException {
        generateByteStream();
        FileInputStream fis = new FileInputStream("dog.txt");

        ObjectInputStream oin = new ObjectInputStream(fis);

        DogDTO dogDTO = (DogDTO) oin.readObject();
        //modify static param
        DogDTO.name = "corgi";

        //success
//        assertThat(dogDTO.name).isEqualTo("teddy");

        //after success
        assertThat(dogDTO.name).isEqualTo("corgi");
    }

    void generateByteStream() throws IOException {
        FileOutputStream fos = new FileOutputStream("dog.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        DogDTO dogDTO = DogDTO.builder().build();
        oos.writeObject(dogDTO);

        oos.flush();
        oos.close();
    }

}
