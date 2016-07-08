package com.masud.dev.examresultsbd;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class failedResult extends Activity {
	
	TextView tvHead, tvBody, tvName, tvExam, tvResult, tvGpa, tvSubject,
	tvBoard, tvSubject1, tvSubject2, tvSubject3, tvSubject4,
	tvSubject5, tvSubject6, tvSubject7, tvSubject8, tvSubject9;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.failedsms);
		
		tvName = (TextView) findViewById(R.id.tvName);
		tvHead = (TextView) findViewById(R.id.tvHeading);
		tvBody = (TextView) findViewById(R.id.tvBody);
		tvExam = (TextView) findViewById(R.id.tvExam);
		tvBoard = (TextView) findViewById(R.id.tvBoard);
		tvGpa = (TextView) findViewById(R.id.tvGPA);
		tvSubject1 = (TextView) findViewById(R.id.tvSubject1);
		tvSubject2 = (TextView) findViewById(R.id.tvSubject2);
		tvSubject3 = (TextView) findViewById(R.id.tvSubject3);
		tvSubject4 = (TextView) findViewById(R.id.tvSubject4);
		tvSubject5 = (TextView) findViewById(R.id.tvSubject5);
		tvSubject6 = (TextView) findViewById(R.id.tvSubject6);
		tvSubject7 = (TextView) findViewById(R.id.tvSubject7);
		tvSubject8 = (TextView) findViewById(R.id.tvSubject8);
		tvSubject9 = (TextView) findViewById(R.id.tvSubject9);

		String strBody = getIntent().getStringExtra("SMS");

		// String strNumber= getIntent().getStringExtra("Number");

		String[] tokens = strBody.split(";");
		String name = tokens[0];
		String exam = tokens[1];
		// String result= tokens[2];
		String gpa = tokens[3];
		String subject = tokens[4];
		String[] examParts = exam.split(":");
		String examName = examParts[0];
		String examBoard = examParts[1];
		String[] examNameParts = examName.split(" ");
		String exam1 = examNameParts[0];

		String[] subjects = subject.split(",");
		String subject01 = subjects[0];
		String[] subjects01 = subject01.split(":");

		String subject1 = subjects01[1] + ":" + subjects01[2];
		String subject2 = subjects[1];
		String subject3 = subjects[2];
		String subject4 = subjects[3];
		String subject5 = subjects[4];
		String subject6 = subjects[5];
		String subject7 = subjects[6];
		String subject8 = subjects[7];
		String subject9 = subjects[8];

		tvName.setText(name);
		tvExam.setText(exam1);
		tvBoard.setText(examBoard);
		// tvResult.setText(result);
//		tvGpa.setText(gpa);
		tvSubject1.setText(subject1);
		tvSubject2.setText(subject2);
		tvSubject3.setText(subject3);
		tvSubject4.setText(subject4);
		tvSubject5.setText(subject5);
		tvSubject6.setText(subject6);
		tvSubject7.setText(subject7);

		tvSubject8.setText(subject8);
//		if (subject9.contains("Powered")) {
//			String[] arraySub9 = subject9.split(" ");
//			String sub9 = arraySub9[0];
//			tvSubject.setText(sub9);

//		} else {
			tvSubject9.setText(subject9);
//		}

	}

}