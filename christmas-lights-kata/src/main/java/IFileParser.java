import java.util.List;

public interface IFileParser {
    List<ActionItem> Parse(List<String> rowsToParse);
}
