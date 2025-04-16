package techsupport;

public class JuniorSupportHandler extends SupportHandler {

    @Override
    public void handle(String issue) {
        if (issue.equals("refund_request") || issue.equals("billing_issue")) {
            System.out.println("[JuniorSupport] Обработал " + issue);
        } else if (next != null) {
            next.handle(issue);
        } else {
            System.out.println("[JuniorSupport] Неизвестная проблема — не могу обработать");
        }
    }
}
