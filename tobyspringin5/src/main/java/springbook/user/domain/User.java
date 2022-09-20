package springbook.user.domain;

import lombok.Data;

@Data
public class User {
    private String id;
    private String name;
    private String password;

    public User() {
    }

    public User(String id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    private User(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.password = builder.password;
    }

    public static class Builder {
        private final String id;
        private final String password;
        private String name = "not yet";


        public Builder(String id, String password) {
            this.id = id;
            this.password = password;
        }


        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
