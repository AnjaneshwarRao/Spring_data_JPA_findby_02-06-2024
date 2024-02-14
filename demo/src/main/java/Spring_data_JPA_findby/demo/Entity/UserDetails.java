package Spring_data_JPA_findby.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "User_Details")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDetails {
    private String emailId;

    private String password;
    private String  name;
    private String gender;
    private long contact;
    private String city;
    private String state;
    private String country;


}
