package Maven.block6pathvariableheaders;

import lombok.Data;

import lombok.AllArgsConstructor;

import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Users {
    private Long id;
    private String name;
}