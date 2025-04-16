package techsupport;

public class SeniorSupportHandler extends SupportHandler {

    @Override
    public void handle(String issue) {
        if (issue.equals("account_ban") || issue.equals("data_loss")) {
            System.out.println("[SeniorSupport] Обработал " + issue);
        } else {
            System.out.println("[SeniorSupport] Не могу обработать " + issue + " — необходимо вмешательство вручную");
        }
    }
}
