package eu.kaluzinski.wordpressjpa.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.URL;

import java.sql.Timestamp;

@Getter
@Setter
@Entity
@Table(name = "wp_users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "user_login")
    @Size(max = 60)
    private String login;

    @NotNull
    @Column(name = "user_pass")
    @Size(max = 255)
    private String password;

    @NotNull
    @Column(name = "user_nicename")
    @Size(max = 50)
    private String nicename;

    @NotNull
    @Column(name = "user_email")
    @Size(max = 100)
    @Email
    private String email;

    @URL
    @NotNull
    @Column(name = "user_url")
    @Size(max = 100)
    private String url;

    @NotNull
    @Column(name = "user_registered")
    private Timestamp registered;

    @NotNull
    @Column(name = "user_activation_key")
    @Size(max = 255)
    private String activationKey;

    @NotNull
    @Column(name = "user_status")
    private Integer status;

    @NotNull
    @Column(name = "display_name")
    @Size(max = 255)
    private String displayName;

}
