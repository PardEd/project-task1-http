import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class JsonRequest {

    private final String id;
    private final String text;
    private final String type;
    private final String user;
    private final Integer upvotes;

    public String getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getType() {
        return type;
    }

    public String getUser() {
        return user;
    }

    public Integer getUpvotes() {
        return upvotes;
    }

    public JsonRequest(
        @JsonProperty("id") String id,
        @JsonProperty("text") String text,
        @JsonProperty("type") String type,
        @JsonProperty("user") String user,
        @JsonProperty("votes") Integer upvotes) {
        this.id = id;
        this.text = text;
        this.type = type;
        this.user = user;
        this.upvotes = upvotes;
    }

    @Override
    public String toString() {
        return "\nJsonRequest" +
            "\nid=" + getId() +
            "\ntext='" + getText() + '\'' +
            "\ntype='" + getType() + '\'' +
            "\nuser='" + getUser() + '\'' +
            "\nvotes=" + getUpvotes();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (obj == null || obj.getClass() != this.getClass())
            return false;
        var that = (JsonRequest) obj;
        return Objects.equals(this.id, that.id) &&
            Objects.equals(this.text, that.text) &&
            Objects.equals(this.type, that.type) &&
            Objects.equals(this.user, that.user) &&
            Objects.equals(this.upvotes, that.upvotes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, text, type, user, upvotes);
    }
}
