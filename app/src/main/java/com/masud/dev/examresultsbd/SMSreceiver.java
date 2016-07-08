//package com.masud.dev.examresultsbd;
//import android.content.BroadcastReceiver;
//import android.content.Context;
//import android.content.Intent;
//import android.os.Bundle;
//import android.telephony.SmsManager;
//import android.telephony.SmsMessage;
//import android.widget.Toast;
//
//public class SMSreceiver extends BroadcastReceiver {
//
//	@Override
//	public void onReceive(Context context, Intent intent) {
//
////		Toast t = Toast.makeText(context,
////				"Intent Action Name:" + intent.getAction(), Toast.LENGTH_LONG);
////		t.show();
//
//		String number = "";
//		String smsBody = "";
//		Bundle bundle = intent.getExtras();
//		SmsMessage[] chunks = null;
//		Object[] pdus = (Object[]) bundle.get("pdus");
//		chunks= new SmsMessage[pdus.length];
//
//		for (int i = 0; i < pdus.length; i++) {
//			chunks[i]= SmsMessage.createFromPdu((byte[])pdus[i]);
//			smsBody+= chunks[i].getMessageBody();
//			number= chunks[i].getOriginatingAddress();
//		}
//
//
//
//
//		if ("16222".equals(number)) {
//
//			if (smsBody.contains("PASSED")) {
//				Intent intentMobile = new Intent(context,
//						ResultFromSMS.class);
//				intentMobile.putExtra("SMS", smsBody);
//				intentMobile.putExtra("Number", number);
//				intentMobile.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//				context.startActivity(intentMobile);
//
//			}else {
//
//				Intent intentMobile = new Intent(context,
//						failedResult.class);
//				intentMobile.putExtra("SMS", smsBody);
//				intentMobile.putExtra("Number", number);
//				intentMobile.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//				context.startActivity(intentMobile);
//
//			}
//
//
//		}else {
////			Intent intentMobile = new Intent(context,
////					MainActivity.class);
////			intentMobile.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
////			context.startActivity(intentMobile);
//		}
//
////		SmsManager manager= SmsManager.getDefault();
////		manager.sendTextMessage(number, null, "I haver got the sms", null, null);
//
//	}
//
//}
