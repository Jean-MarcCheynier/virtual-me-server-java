package jmcheynier.apps.portfolio.models.mongoModel;

import org.springframework.data.annotation.Id;

public class Skill {
	

    @Id
    public String id;
    public String name;
    public String type;

    public Skill() {}

    public Skill(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%s, name='%s', type='%s']",
                id, name, type);
    }

}
