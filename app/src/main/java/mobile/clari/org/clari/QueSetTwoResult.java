package mobile.clari.org.clari;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;


public class QueSetTwoResult extends ActionBarActivity {
    TextView header, footer, link1, link2, link3, link4, link5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_que_set_two_result);
        Globals g = (Globals) getApplication();
        header = (TextView) findViewById(R.id.header);
        footer = (TextView) findViewById(R.id.footer);
        link1 = (TextView) findViewById(R.id.link1);
        link2 = (TextView) findViewById(R.id.link2);
        link3 = (TextView) findViewById(R.id.link3);
        link4 = (TextView) findViewById(R.id.link4);
        link5 = (TextView) findViewById(R.id.link5);

        if (g.getmf() == 1) {
            if (g.getAns2a().equals("yes")) {
                header.setText("Your list of possible conditions include\n");
                link1.setText(Html.fromHtml("<u>Urinary tract infection</u> "));
                link1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        AlertDialog.Builder alert = new AlertDialog.Builder(QueSetTwoResult.this);
                        alert.setTitle("Urinary tract infection");

                        WebView wv = new WebView(QueSetTwoResult.this);
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
                link2.setText(Html.fromHtml("<u>Prostatitis</u> "));
                link2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        AlertDialog.Builder alert = new AlertDialog.Builder(QueSetTwoResult.this);
                        alert.setTitle("Prostatitis");

                        WebView wv = new WebView(QueSetTwoResult.this);
                        wv.loadUrl("http://en.wikipedia.org/wiki/Prostatitis");
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
                link3.setText(Html.fromHtml("<u>Cystitis</u> "));
                link3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        AlertDialog.Builder alert = new AlertDialog.Builder(QueSetTwoResult.this);
                        alert.setTitle("Cystitis");

                        WebView wv = new WebView(QueSetTwoResult.this);
                        wv.loadUrl("http://en.wikipedia.org/wiki/Interstitial_cystitis");
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
                link4.setText(Html.fromHtml("<u>Pyelonephritis</u> "));
                link4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        AlertDialog.Builder alert = new AlertDialog.Builder(QueSetTwoResult.this);
                        alert.setTitle("Pyelonephritis");

                        WebView wv = new WebView(QueSetTwoResult.this);
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
                link5.setVisibility(View.GONE);
                footer.setText("\nVisit the Urologist for treatment and advice");
            } else if (g.getAns2b().equals("yes")) {
                link1.setText(Html.fromHtml("<u>Kidney stone</u> "));
                link1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        AlertDialog.Builder alert = new AlertDialog.Builder(QueSetTwoResult.this);
                        alert.setTitle("Kidney stone");

                        WebView wv = new WebView(QueSetTwoResult.this);
                        wv.loadUrl("http://en.wikipedia.org/wiki/Kidney_stone");
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
                header.setText("Your list of possible conditions include\n");
                link2.setVisibility(View.GONE);
                link3.setVisibility(View.GONE);
                link4.setVisibility(View.GONE);
                link5.setVisibility(View.GONE);
                footer.setText("\nYou may have a Kidney stone ,seek Urologist advice right away.");

            } else {
                header.setText("We are sorry that we are unable to help you at this time. Please visit your doctor for advice");
                link1.setVisibility(View.INVISIBLE);
                link2.setVisibility(View.INVISIBLE);
                link3.setVisibility(View.INVISIBLE);
                link4.setVisibility(View.INVISIBLE);
                link5.setVisibility(View.INVISIBLE);
                footer.setVisibility(View.INVISIBLE);


            }
        } else {
            if (g.getAns2a().equals("yes")) {
                header.setText("Your list of possible conditions include\n");
                link1.setText(Html.fromHtml("<u>Urinary tract infection</u> "));
                link1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        AlertDialog.Builder alert = new AlertDialog.Builder(QueSetTwoResult.this);
                        alert.setTitle("Urinary tract infection");

                        WebView wv = new WebView(QueSetTwoResult.this);
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
                link2.setText(Html.fromHtml("<u>Prostatitis</u> "));
                link2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        AlertDialog.Builder alert = new AlertDialog.Builder(QueSetTwoResult.this);
                        alert.setTitle("Prostatitis");

                        WebView wv = new WebView(QueSetTwoResult.this);
                        wv.loadUrl("http://en.wikipedia.org/wiki/Prostatitis");
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
                link3.setText(Html.fromHtml("<u>Cystitis</u> "));
                link3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        AlertDialog.Builder alert = new AlertDialog.Builder(QueSetTwoResult.this);
                        alert.setTitle("Cystitis");

                        WebView wv = new WebView(QueSetTwoResult.this);
                        wv.loadUrl("http://en.wikipedia.org/wiki/Interstitial_cystitis");
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
                link4.setText(Html.fromHtml("<u>Pyelonephritis</u> "));
                link4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        AlertDialog.Builder alert = new AlertDialog.Builder(QueSetTwoResult.this);
                        alert.setTitle("Pyelonephritis");

                        WebView wv = new WebView(QueSetTwoResult.this);
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
                link5.setVisibility(View.GONE);
                footer.setText("\nVisit the Urologist for treatment and advice");
            } else if (g.getAns2b().equals("yes")) {
                link1.setText(Html.fromHtml("<u>Kidney stone</u> "));
                link1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        AlertDialog.Builder alert = new AlertDialog.Builder(QueSetTwoResult.this);
                        alert.setTitle("Kidney stone");

                        WebView wv = new WebView(QueSetTwoResult.this);
                        wv.loadUrl("http://en.wikipedia.org/wiki/Kidney_stone");
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
                header.setText("Your list of possible conditions include\n");
                link2.setVisibility(View.GONE);
                link3.setVisibility(View.GONE);
                link4.setVisibility(View.GONE);
                link5.setVisibility(View.GONE);
                footer.setText("\nYou may have a Kidney stone ,seek Urologist advice right away.");
            } else if (g.getAns2c().equals("yes")) {
                header.setText("Your list of possible conditions include\n");
                link1.setText(Html.fromHtml("<u>Endometriosis</u> "));
                link1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        AlertDialog.Builder alert = new AlertDialog.Builder(QueSetTwoResult.this);
                        alert.setTitle("Endometriosis");

                        WebView wv = new WebView(QueSetTwoResult.this);
                        wv.loadUrl("http://en.wikipedia.org/wiki/Endometriosis");
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
                link2.setText(Html.fromHtml("<u>Pelvic inflammatory disease</u> "));
                link2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        AlertDialog.Builder alert = new AlertDialog.Builder(QueSetTwoResult.this);
                        alert.setTitle("Pelvic inflammatory disease");

                        WebView wv = new WebView(QueSetTwoResult.this);
                        wv.loadUrl("http://en.wikipedia.org/wiki/Pelvic_inflammatory_disease");
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
                link3.setText(Html.fromHtml("<u>Premenstrual syndrome</u> "));
                link3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        AlertDialog.Builder alert = new AlertDialog.Builder(QueSetTwoResult.this);
                        alert.setTitle("Premenstrual syndrome");

                        WebView wv = new WebView(QueSetTwoResult.this);
                        wv.loadUrl("http://en.wikipedia.org/wiki/Premenstrual_syndrome");
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
                link4.setText(Html.fromHtml("<u>Ovarian cyst</u> "));
                link4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        AlertDialog.Builder alert = new AlertDialog.Builder(QueSetTwoResult.this);
                        alert.setTitle("Ovarian cyst");

                        WebView wv = new WebView(QueSetTwoResult.this);
                        wv.loadUrl("http://en.wikipedia.org/wiki/Ovarian_cyst");
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
                link5.setText(Html.fromHtml("<u>Uterine fibroid</u> "));
                link5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        AlertDialog.Builder alert = new AlertDialog.Builder(QueSetTwoResult.this);
                        alert.setTitle("Uterine fibroid");

                        WebView wv = new WebView(QueSetTwoResult.this);
                        wv.loadUrl("http://en.wikipedia.org/wiki/Uterine_fibroid");
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
                footer.setText("\nVisit the Urologist for treatment and advice");
            } else {
                header.setText("We are sorry that we are unable to help you at this time. Please visit your doctor for advice");
                link1.setVisibility(View.INVISIBLE);
                link2.setVisibility(View.INVISIBLE);
                link3.setVisibility(View.INVISIBLE);
                link4.setVisibility(View.INVISIBLE);
                link5.setVisibility(View.INVISIBLE);
                footer.setVisibility(View.INVISIBLE);

            }

        }
    }


}
