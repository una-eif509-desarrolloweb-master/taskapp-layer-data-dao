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
 * Entity for the role
 */
@Entity
@Table( name = "role" )
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Role {
    // Properties
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_role")
    private Long idRole;
    private String name;

    // Relationship definition
    @ManyToMany(mappedBy = "roleList")
    private List<User> usersList;

    @ManyToMany (fetch = FetchType.EAGER)
    @JoinTable(
            name = "role_privilege",
            joinColumns = @JoinColumn(name = "id_role"),
            inverseJoinColumns = @JoinColumn(name = "id_privilege"))
    private List<Privilege> privilegeList;
}
