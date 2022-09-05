package serializableDemo.dto;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import static org.assertj.core.api.Assertions.assertThat;

class ChildDTOTest {
    @Test
    void should_get_file_info_success_when_parent_has_serializable_and_child_extend_parent() throws IOException, ClassNotFoundException {
//        generateByteStream();
        FileInputStream fis = new FileInputStream("child.txt");

        ObjectInputStream oin = new ObjectInputStream(fis);

        ChildDTO childDTO = (ChildDTO) oin.readObject();

        assertThat(childDTO.getParentName()).isEqualTo("张一");
    }

    void generateByteStream() throws IOException {
        FileOutputStream fos = new FileOutputStream("child.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        ChildDTO childDTO = ChildDTO.builder().parentName("张一").name("张三").age(18).gender("male").build();
        oos.writeObject(childDTO);

        oos.flush();
        oos.close();
    }

}
