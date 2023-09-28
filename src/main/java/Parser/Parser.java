package Parser;

import Task.TaskList;
import Ui.Ui;

public class Parser {
    public static void parse(String buf, TaskList itemList){
        switch(buf.toLowerCase().split(" ")[0]) {
            case "list":
                itemList.listItems();
                break;

            case "mark":
                itemList.markTask(Integer.parseInt(buf.split(" ")[1]));
                break;

            case "unmark":
                itemList.unmarkTask(Integer.parseInt(buf.split(" ")[1]));
                break;

            case "todo":
                itemList.addTodo(buf);
                break;

            case "deadline":
                itemList.addDeadline(buf);
                break;

            case "event":
                itemList.addEvent(buf);
                break;

            case "delete":
                itemList.delete(Integer.parseInt(buf.split(" ")[1]));
                break;

            default:
                Ui.reportMissingCommandWord();
                break;
        }
    }
}
