package serializableDemo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ParentDTO implements Serializable {
    private  static  final  long serialVersionUID = 3;
    public String name;
    public int age;
    public String gender;
}
