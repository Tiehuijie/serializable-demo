package serializableDemo.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class ChildDTO extends ParentDTO{
    private  static  final  long serialVersionUID = 4;
    private String parentName;
    private String description;

    @Builder(toBuilder = true)
    public ChildDTO(String name, int age, String gender, String parentName, String description) {
        super(name, age, gender);
        this.parentName = parentName;
        this.description = description;
    }
}
