import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

/**
 * The type Configuration.
 */
public class Configuration extends BaseConfiguration {

    @NotEmpty
    @JsonProperty
    private String environmentName;

    @Valid
    @NotNull
    @JsonProperty
    private AuthConfig authConfig;

    /**
     * Gets environment name.
     *
     * @return the environment name
     */
    public String getEnvironmentName() {
        return environmentName;
    }

    /**
     * Gets auth config.
     *
     * @return the auth config
     */
    public AuthConfig getAuthConfig() {
        return authConfig;
    }
}
