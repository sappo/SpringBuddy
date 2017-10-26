package de.detim.codegen.awespring.persistence.entities;

import javax.persistence.*;

@Entity
@Table(name = "region")
public class Region {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, unique = true)
    private String regionName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Region{");
        sb.append("id=").append(id);
        sb.append(", regionName='").append(regionName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
