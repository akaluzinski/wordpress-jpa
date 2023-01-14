package eu.kaluzinski.wordpressjpa.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "wp_usermeta")
public class UserMeta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "umeta_id")
    private Long id;

    @NotNull
    @Size(max = 255)
    @Column(name = "user_id")
    private Long userId;

    @Column(name = "meta_key")
    private String metaKey;

    @Lob
    @Column(name = "meta_value", columnDefinition = "LONGTEXT")
    private String metaValue;
}
