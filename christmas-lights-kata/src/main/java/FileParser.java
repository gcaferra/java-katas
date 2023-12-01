import java.util.ArrayList;
import java.util.List;

public class FileParser implements IFileParser {

    @Override
    public List<ActionItem> Parse(List<String> rowsToParse) {
        var actionItems = new ArrayList<ActionItem>();
        for (var row : rowsToParse) {
            var actionItem = getRowParts(row);
            actionItems.add(actionItem);
        }
        return actionItems;
    }

    public ActionItem getRowParts(String row) {
        var parts = row.split("\\s");

        if (parts.length == 5) {
            return new ActionItem(parts[0] + " " + parts[1],
                    Integer.parseInt(parts[2].split(",")[0]),
                    Integer.parseInt(parts[2].split(",")[1]),
                    Integer.parseInt(parts[4].split(",")[0]),
                    Integer.parseInt(parts[4].split(",")[1])
            );
        }
        if (parts.length == 4) {
            return new ActionItem(parts[0],
                    Integer.parseInt(parts[1].split(",")[0]),
                    Integer.parseInt(parts[1].split(",")[1]),
                    Integer.parseInt(parts[3].split(",")[0]),
                    Integer.parseInt(parts[3].split(",")[1])
            );

        }

        throw new RuntimeException("Can't parse given row");
    }
}