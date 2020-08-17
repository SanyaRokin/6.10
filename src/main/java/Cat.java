
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;

public class Cat {
    private final String _id;
    private final String text;
    private final String type;
    private final JsonNode user;
    private final int upvotes;
    private final int userUpvoted;

    public Cat(
            @JsonProperty("id") String _id,
            @JsonProperty("text") String text,
            @JsonProperty("type") String type,
            @JsonProperty("user") JsonNode user,
            @JsonProperty("upvotes") int upvotes,
            @JsonProperty("userUpvoted") int userUpvoted) {
        this._id = _id;
        this.text = text;
        this.type = type;
        this.user = user;
        this.upvotes = upvotes;
        this.userUpvoted = userUpvoted;
    }

    public String get_id() {
        return _id;
    }

    public String getText() {
        return text;
    }

    public String getType() {
        return type;
    }

    public int getUpvotes() {
        return upvotes;
    }

    public int getUserUpvoted() {
        return userUpvoted;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "_id='" + _id + '\'' +
                ", text='" + text + '\'' +
                ", type='" + type + '\'' +
                ", user='" + user + '\'' +
                ", upvotes=" + upvotes +
                ", userUpvoted=" + userUpvoted +
                '}';
    }
}