package serializableDemo.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class ChildDTO extends ParentDTO{
    private String parentName;

    @Builder(toBuilder = true)
    public ChildDTO(String name, int age, String gender, String parentName) {
        super(name, age, gender);
        this.parentName = parentName;
    }
}
