package com.codekoro.api.f;

public class SwitchRecordsRunner {

	sealed interface CustomerMessage permits Message, Feedback{}
	final record Message(String text) implements CustomerMessage {}
	final record Feedback(int rating, String description) implements CustomerMessage {}

	record SupportRequest(String user, CustomerMessage message) {}

	public static void main(String[] args) {
//		CustomerMessage customerMessage = new Message("Hello!");
		CustomerMessage customerMessage = new Feedback(5, "Great service!");

		String response = switch(customerMessage) {
		case Message(String text) -> text;
		case Feedback(int rating, String description) -> description;
//		default -> "Default value";
		};

		System.out.println(response);

		SupportRequest request
			= new SupportRequest("Kairi",
					new Feedback(5, "Saved!"));

		String responseMessage = switch(request) {
		case SupportRequest(String user,
				Message (String text)) -> "Message";
		case SupportRequest(String user,
				Feedback (int rating, String feedback)) -> "Feedback";
		};

		System.out.println(responseMessage);
	}

}
