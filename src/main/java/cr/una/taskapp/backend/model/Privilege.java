/*
 * Universidad Nacional de Costa Rica  2020
 *
 * mike@guzmanalan.com
 */

package cr.una.taskapp.backend.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

/**
 * Entity for the user
 */
@Entity
@Table( name = "privilege" )
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Privilege {
    // Properties
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_privilege")
    private Long idPrivilege;
    private String name;

    // Relationship definition
    @ManyToMany(mappedBy = "roleList")
    private List<User> usersList;
    @ManyToMany(mappedBy = "privilegeList")
    private List<Role> roleList;
}
