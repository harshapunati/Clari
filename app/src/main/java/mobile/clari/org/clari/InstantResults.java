package mobile.clari.org.clari;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import android.widget.Toast;

import com.gc.materialdesign.widgets.Dialog;

import java.util.Calendar;
import java.util.GregorianCalendar;


public class InstantResults extends ActionBarActivity {
    int ageInstant;
    int c;
    TextView t, t1, t2, t3, tf;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instant_results);
        Globals g = (Globals) getApplication();
        Calendar dateOfYourBirth = new GregorianCalendar(g.getdobYear(), g.getdobMonth(), g.getdobDate());
        Calendar today = Calendar.getInstance();
        t = (TextView) findViewById(R.id.starttext);
        t1 = (TextView) findViewById(R.id.text1);
        t2 = (TextView) findViewById(R.id.text2);
        t3 = (TextView) findViewById(R.id.text3);
        tf = (TextView) findViewById(R.id.endtext);

        ageInstant = today.get(Calendar.YEAR) - dateOfYourBirth.get(Calendar.YEAR);
        dateOfYourBirth.add(Calendar.YEAR, ageInstant);
        if (today.before(dateOfYourBirth)) {
            ageInstant--;
        }
        if (ageInstant >= 13 && ageInstant <= 16) {
            c = 1;
        } else if (ageInstant >= 17 && ageInstant <= 49) {
            c = 2;
        } else if (ageInstant >= 50) {
            c = 3;
        } else {
            c = 4;
        }
        //Toast.makeText(InstantResults.this, ageInstant + "", Toast.LENGTH_SHORT).show();
        switch (c) {
            case 1:

                t.setText("The most common causes of back pain in adolescents are :-");
                t1.setText(Html.fromHtml("<u>Back Strain</u> "));
                t1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        AlertDialog.Builder alert = new AlertDialog.Builder(InstantResults.this);
                        alert.setTitle("Back Strain");

                        WebView wv = new WebView(InstantResults.this);
                        wv.loadUrl("http://en.wikipedia.org/wiki/Back_pain");
                        wv.setWebViewClient(new WebViewClient() {
                            @Override
                            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                                view.loadUrl(url);

                                return true;
                            }
                        });

                        alert.setView(wv);
                        alert.setNegativeButton("Close", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.dismiss();
                            }
                        });
                        alert.show();
                    }
                });

                t2.setText(Html.fromHtml("<u>Kyphoscoliosis</u> "));
                t2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        AlertDialog.Builder alert = new AlertDialog.Builder(InstantResults.this);
                        alert.setTitle("Kyphoscoliosis");

                        WebView wv = new WebView(InstantResults.this);
                        wv.loadUrl("http://en.wikipedia.org/wiki/Kyphoscoliosis");
                        wv.setWebViewClient(new WebViewClient() {
                            @Override
                            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                                view.loadUrl(url);

                                return true;
                            }
                        });

                        alert.setView(wv);
                        alert.setNegativeButton("Close", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.dismiss();
                            }
                        });
                        alert.show();
                    }
                });
                t3.setText(Html.fromHtml("<u>Urinary tract infection</u> "));
                t3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        AlertDialog.Builder alert = new AlertDialog.Builder(InstantResults.this);
                        alert.setTitle("Urinary tract infection");

                        WebView wv = new WebView(InstantResults.this);
                        wv.loadUrl("http://en.wikipedia.org/wiki/Urinary_tract_infection");
                        wv.setWebViewClient(new WebViewClient() {
                            @Override
                            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                                view.loadUrl(url);

                                return true;
                            }
                        });

                        alert.setView(wv);
                        alert.setNegativeButton("Close", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.dismiss();
                            }
                        });
                        alert.show();
                    }
                });
                tf.setText("Please visit your local doctor for advice and treatment");
                break;

            case 3:
                t.setText("The most common causes of bach pain in Adults and Young Adults are :-");
                t1.setText(Html.fromHtml("<u>Degenerative disc disease</u> "));
                t1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        AlertDialog.Builder alert = new AlertDialog.Builder(InstantResults.this);
                        alert.setTitle("Degenerative disc disease");

                        WebView wv = new WebView(InstantResults.this);
                        wv.loadUrl("http://en.wikipedia.org/wiki/Degenerative_disc_disease");
                        wv.setWebViewClient(new WebViewClient() {
                            @Override
                            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                                view.loadUrl(url);

                                return true;
                            }
                        });

                        alert.setView(wv);
                        alert.setNegativeButton("Close", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.dismiss();
                            }
                        });
                        alert.show();
                    }
                });

                t2.setText(Html.fromHtml("<u>Pyelonephritis</u> "));
                t2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        AlertDialog.Builder alert = new AlertDialog.Builder(InstantResults.this);
                        alert.setTitle("Pyelonephritis");

                        WebView wv = new WebView(InstantResults.this);
                        wv.loadUrl("http://en.wikipedia.org/wiki/Pyelonephritis");
                        wv.setWebViewClient(new WebViewClient() {
                            @Override
                            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                                view.loadUrl(url);

                                return true;
                            }
                        });

                        alert.setView(wv);
                        alert.setNegativeButton("Close", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.dismiss();
                            }
                        });
                        alert.show();
                    }
                });
                t3.setText(Html.fromHtml("<u>Viral infections</u> "));
                t3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        AlertDialog.Builder alert = new AlertDialog.Builder(InstantResults.this);
                        alert.setTitle("Viral infections");

                        WebView wv = new WebView(InstantResults.this);
                        wv.loadUrl("http://en.wikipedia.org/wiki/Viral_disease");
                        wv.setWebViewClient(new WebViewClient() {
                            @Override
                            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                                view.loadUrl(url);

                                return true;
                            }
                        });

                        alert.setView(wv);
                        alert.setNegativeButton("Close", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.dismiss();
                            }
                        });
                        alert.show();
                    }
                });
                tf.setText("Please visit your local doctor for advice and treatment");
                break;

            case 2:
                t.setText("The most common causes of bach pain in adolosents are :-");
                t1.setText(Html.fromHtml("<u>Back Strain</u> "));
                t1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        AlertDialog.Builder alert = new AlertDialog.Builder(InstantResults.this);
                        alert.setTitle("Back Strain");

                        WebView wv = new WebView(InstantResults.this);
                        wv.loadUrl("http://en.wikipedia.org/wiki/Back_pain");
                        wv.setWebViewClient(new WebViewClient() {
                            @Override
                            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                                view.loadUrl(url);

                                return true;
                            }
                        });

                        alert.setView(wv);
                        alert.setNegativeButton("Close", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.dismiss();
                            }
                        });
                        alert.show();
                    }
                });
                t2.setText(Html.fromHtml("<u>Urinary tract infection</u> "));
                t2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        AlertDialog.Builder alert = new AlertDialog.Builder(InstantResults.this);
                        alert.setTitle("Urinary tract infection");

                        WebView wv = new WebView(InstantResults.this);
                        wv.loadUrl("http://en.wikipedia.org/wiki/Urinary_tract_infection");
                        wv.setWebViewClient(new WebViewClient() {
                            @Override
                            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                                view.loadUrl(url);

                                return true;
                            }
                        });

                        alert.setView(wv);
                        alert.setNegativeButton("Close", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.dismiss();
                            }
                        });
                        alert.show();
                    }
                });
                t3.setText(Html.fromHtml("<u>Gynecologic condition like Pelvic</u> "));
                t3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        AlertDialog.Builder alert = new AlertDialog.Builder(InstantResults.this);
                        alert.setTitle("Gynecologic hemorrhage");

                        WebView wv = new WebView(InstantResults.this);
                        wv.loadUrl("http://en.wikipedia.org/wiki/Gynecologic_hemorrhage");
                        wv.setWebViewClient(new WebViewClient() {
                            @Override
                            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                                view.loadUrl(url);

                                return true;
                            }
                        });

                        alert.setView(wv);
                        alert.setNegativeButton("Close", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.dismiss();
                            }
                        });
                        alert.show();
                    }
                });

                tf.setText("Please visit your local doctor for advice and treatment");
                break;

            default:
                t.setText("Age = " + ageInstant + "");
                t1.setVisibility(View.INVISIBLE);
                t2.setVisibility(View.INVISIBLE);
                t3.setVisibility(View.INVISIBLE);
                tf.setVisibility(View.INVISIBLE);
        }
    }


}
