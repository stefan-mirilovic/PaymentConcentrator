package com.paymentconcentrator.bitcoin.utils.globals;

public abstract class PaymentConstants {
	private static final String HOST = "http://localhost:8084/api/pay/";

	public static class Api {
		public static final String API_ORDERS = "https://api-sandbox.coingate.com/v2/orders";
	}
	public static class Url {
		public static final String HOST = "http://localhost:8084/api/pay/";
		public static final String SUCCESS_URL = "payment-successful/";
		public static final String CANCEL_URL = "payment-cancelled/";
		public static final String REDIRECT_SUCCESS = "success <p><a href=\"http://localhost:4200/chose/payment\">Back to home</a></p>";
	}


	public static class Header {
		public static final String TOKEN = "Token ";
		public static final String AUTHORIZATION = "Authorization";
	}

	public static class BodyParam {
		public static final String TITLE = "title";
		public static final String CANCEL_URL = "cancel_url";
		public static final String SUCCESS_URL = "success_url";
		public static final String PRICE_AMOUNT = "price_amount";
		public static final String PRICE_CURRENCY= "price_currency";
		public static final String RECEIVE_CURRENCY = "receive_currency";
	}

	public static class Info {
		public static final String CURRENCY = "USD";
		public static final String TITLES = "Test title";
		public static final String PAYMENT_METHOD = "coin-gate";
	}

}
