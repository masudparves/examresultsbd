package com.masud.dev.examresultsbd;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.TranslateAnimation;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Toast;

@SuppressLint("ResourceAsColor")
public class CustomizeWebview extends FrameLayout implements OnTouchListener {

//	private static final long ANIMATION_DURATION_TIME = 400;
//	private Button mPreBbn;
//	private Button mReload;
//	private Button mNextBtn;
	private WebView mWebView;

	private boolean mIsLoadFinish = false;
//	private LinearLayout mWebViewControllerLn;
	private WebViewClient mWebViewClient;
	private boolean isView = true;
	private boolean isMoved = false;
	private GestureDetector mDetector;
	
	
	
	
	
	
	

	public CustomizeWebview(final Context context, final AttributeSet attrs) {
		super(context, attrs);
		mWebView = new WebView(getContext());
		mWebView.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT,
				LayoutParams.MATCH_PARENT));
		mWebView.setOnTouchListener(this);
		addView(mWebView);

//		mReload = new Button(getContext());
//		mReload.setText("Reload");
//		mReload.setTextColor(Color.BLUE);
//		mReload.setTextSize(13);
//		mReload.setTypeface(null, Typeface.BOLD);
//		mReload.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, 105));
//
//		mNextBtn = new Button(getContext());
//		mNextBtn.setText("  ->  ");
//		mNextBtn.setTextColor(Color.BLUE);
//		mNextBtn.setTextSize(13);
//		mNextBtn.setTypeface(null, Typeface.BOLD);
//		mNextBtn.setEnabled(false);
//		mNextBtn.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, 105));
//		mPreBbn = new Button(getContext());
//		mPreBbn.setText("  <-  ");
//		mPreBbn.setTextColor(Color.BLUE);
//		mPreBbn.setTextSize(13);
//		mPreBbn.setTypeface(null, Typeface.BOLD);
//		mPreBbn.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, 105));
//		mPreBbn.setEnabled(false);

//		mWebViewControllerLn = new LinearLayout(getContext());
//		mWebViewControllerLn.setLayoutParams(new LayoutParams(
//				LayoutParams.MATCH_PARENT, 105, Gravity.CENTER_HORIZONTAL));
//		mWebViewControllerLn.setGravity(1);
//		mWebViewControllerLn.setOrientation(LinearLayout.HORIZONTAL);
//		mWebViewControllerLn.setBackgroundColor(Color.TRANSPARENT);
//
//		mWebViewControllerLn.addView(mPreBbn);
//		mWebViewControllerLn.addView(mReload);
//		mWebViewControllerLn.addView(mNextBtn);
//		addView(mWebViewControllerLn);

//		// Setup for button controller
//		mReload.setOnClickListener(new OnClickListener() {
//			@Override
//			public void onClick(View v) {
//				mWebView.reload();
//				enableControllerButton();
//			}
//		});
//		mPreBbn.setOnClickListener(new OnClickListener() {
//			public void onClick(View v) {
//				mWebView.goBack();
//				enableControllerButton();
//			}
//		});
//		mNextBtn.setOnClickListener(new OnClickListener() {
//			@Override
//			public void onClick(View v) {
//				mWebView.goForward();
//				enableControllerButton();
//			}
//		});
//
//		
//		
//		
//		
//		// Detect the long touch event in list view
//				mDetector = new GestureDetector(getContext(),
//						new SimpleOnGestureListener() {
//							@Override
//							public boolean onDoubleTap(MotionEvent e) {
//								return super.onDoubleTap(e);
//							}
//
//							@Override
//							public boolean onSingleTapUp(MotionEvent e) {
//								return super.onSingleTapUp(e);
//							}
//
//							@Override
//							public boolean onSingleTapConfirmed(MotionEvent e) {
//								if (isMoved) {
//									return super.onSingleTapConfirmed(e);
//								}
//								isMoved = true;
//								if (isView) {
//									hide();
//								} else {
//									view();
//								}
//								return super.onSingleTapConfirmed(e);
//							}
//						});
//				mHandler.sendEmptyMessageDelayed(1, 5000);
//			}
//
//			protected void hide() {
//				TranslateAnimation inAnimation = new TranslateAnimation(0, 0, 0,
//						-mWebViewControllerLn.getHeight());
//				inAnimation.setDuration(ANIMATION_DURATION_TIME);
//				inAnimation.setFillEnabled(true);
//				inAnimation.setFillAfter(true);
//				inAnimation.setFillBefore(true);
//				inAnimation.setAnimationListener(new AnimationListener() {
//
//					@Override
//					public void onAnimationStart(Animation arg0) {
//
//					}
//
//					@Override
//					public void onAnimationRepeat(Animation arg0) {
//
//					}
//
//					@Override
//					public void onAnimationEnd(Animation arg0) {
//						mHandler.sendEmptyMessageDelayed(1, 5000);
//						isMoved = false;
//						isView = false;
//					}
//				});
//				mWebViewControllerLn.startAnimation(inAnimation);
//			}
//
//			protected void view() {
//				TranslateAnimation outAnimation = new TranslateAnimation(0, 0,
//						-mWebViewControllerLn.getHeight(), 0);
//				outAnimation.setDuration(ANIMATION_DURATION_TIME);
//				outAnimation.setFillEnabled(true);
//				outAnimation.setFillAfter(true);
//				outAnimation.setAnimationListener(new AnimationListener() {
//
//					@Override
//					public void onAnimationStart(Animation animation) {
//
//					}
//
//					@Override
//					public void onAnimationRepeat(Animation animation) {
//					}
//
//					@Override
//					public void onAnimationEnd(Animation animation) {
//						isView = true;
//						isMoved = false;
//					}
//				});
//				mWebViewControllerLn.startAnimation(outAnimation);
//			}
//
//			protected Handler mHandler = new Handler() {
//				@Override
//				public void handleMessage(Message msg) {
//					super.handleMessage(msg);
//					switch (msg.what) {
//					case 1:
//						if (isView) {
//							hide();
//						}
//						mHandler.removeMessages(1);
//						break;
//					default:
//						break;
//					}
//				}
			};

	public void loadUrl(String url) {
		mWebViewClient = new WebViewClient() {
			@Override
			public boolean shouldOverrideUrlLoading(WebView view, String url) {
				return super.shouldOverrideUrlLoading(view, url);
			}

			@Override
			public void onPageStarted(WebView view, String url,
					android.graphics.Bitmap favicon) {
			}

			@Override
			public void onPageFinished(WebView view, String url) {
				mIsLoadFinish = true;
//				enableControllerButton();
			}
		};
		mWebView.setWebViewClient(mWebViewClient);
		mWebView.loadUrl(url);
	}

//	private void enableControllerButton() {
//		if (mIsLoadFinish) {
//			mReload.setEnabled(true);
//			if (mWebView.canGoBack()) {
//				mPreBbn.setEnabled(true);
//			} else {
//				mPreBbn.setEnabled(false);
//			}
//			if (mWebView.canGoForward()) {
//				mNextBtn.setEnabled(true);
//			} else {
//				mNextBtn.setEnabled(false);
//			}
//		} else {
//			mPreBbn.setEnabled(false);
//			mNextBtn.setEnabled(false);
//		}
//	}
//
//	public void setReloadDrawableResource(int resourceId) {
//		mReload.setBackgroundResource(resourceId);
//	}
//
//	public void setBackDrawableResource(int resourceId) {
//		mPreBbn.setBackgroundResource(resourceId);
//	}
//
//	public void setNextDrawableResource(int resourceId) {
//		mNextBtn.setBackgroundResource(resourceId);
//	}

	public WebView getWebView() {
		return mWebView;
	}
//	@Override
//	public boolean onTouch(View v, MotionEvent evt) {
//		mDetector.onTouchEvent(evt);
//		return false;
//	}

	public void setWebViewClient(WebViewClient webViewClient) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean onTouch(View arg0, MotionEvent arg1) {
		// TODO Auto-generated method stub
		return false;
	}

	
	
	
}