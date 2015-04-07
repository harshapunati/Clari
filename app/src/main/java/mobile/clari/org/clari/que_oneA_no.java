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
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.gc.materialdesign.views.ButtonRectangle;

import java.util.Calendar;
import java.util.GregorianCalendar;


public class que_oneA_no extends ActionBarActivity {
    int ageInstant;
    TextView header, footer, tone, ttwo, tthree, tfour, tfive;
    RadioGroup que1dGroup;
    TextView ques;
    ButtonRectangle nextButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_que_one_a_no);
        ques = (TextView) findViewById(R.id.question);
        ques.setVisibility(View.INVISIBLE);
        final Globals g = (Globals) getApplication();
        Calendar dateOfYourBirth = new GregorianCalendar(g.getdobYear(), g.getdobMonth(), g.getdobDate());
        Calendar today = Calendar.getInstance();
        nextButton = (ButtonRectangle) findViewById(R.id.nextButton);
        nextButton.setRippleSpeed(20);
        nextButton.setVisibility(View.INVISIBLE);
        header = (TextView) findViewById(R.id.header);
        footer = (TextView) findViewById(R.id.footer);
        tone = (TextView) findViewById(R.id.tone);
        ttwo = (TextView) findViewById(R.id.ttwo);
        tthree = (TextView) findViewById(R.id.tthree);
        tfour = (TextView) findViewById(R.id.tfour);
        tfive = (TextView) findViewById(R.id.tfive);
        //header.setText("The list of possible conditions you might have include\n");
        que1dGroup = (RadioGroup) findViewById(R.id.radioGrp1d);
        que1dGroup.setVisibility(View.INVISIBLE);
        ageInstant = today.get(Calendar.YEAR) - dateOfYourBirth.get(Calendar.YEAR);
        dateOfYourBirth.add(Calendar.YEAR, ageInstant);
        if (today.before(dateOfYourBirth)) {
            ageInstant--;
        }
        if (ageInstant < 65) {
            if (g.getAns1c().equals("yes")) {
                header.setText("The list of possible conditions you might have include\n");
                tone.setText(Html.fromHtml("<u>Osteoporosis</u> "));
                tone.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        AlertDialog.Builder alert = new AlertDialog.Builder(que_oneA_no.this);
                        alert.setTitle("Osteoporosis");

                        WebView wv = new WebView(que_oneA_no.this);
                        wv.loadUrl("http://en.wikipedia.org/wiki/Osteoporosis");
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
                ttwo.setText(Html.fromHtml("<u>Polymyalgia rheumatica</u> "));
                ttwo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        AlertDialog.Builder alert = new AlertDialog.Builder(que_oneA_no.this);
                        alert.setTitle("Polymyalgia rheumatica");

                        WebView wv = new WebView(que_oneA_no.this);
                        wv.loadUrl("http://en.wikipedia.org/wiki/Polymyalgia_rheumatica");
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

                tthree.setText(Html.fromHtml("<u>Compression fracture</u> "));
                tthree.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        AlertDialog.Builder alert = new AlertDialog.Builder(que_oneA_no.this);
                        alert.setTitle("Compression fracture");

                        WebView wv = new WebView(que_oneA_no.this);
                        wv.loadUrl("http://en.wikipedia.org/wiki/Vertebral_compression_fracture");
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

                tfour.setText(Html.fromHtml("<u>Viral disease</u> "));
                tfour.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        AlertDialog.Builder alert = new AlertDialog.Builder(que_oneA_no.this);
                        alert.setTitle("Viral disease");

                        WebView wv = new WebView(que_oneA_no.this);
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

                tfive.setText(Html.fromHtml("<u>Strain/Sprain</u> "));
                tfive.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        AlertDialog.Builder alert = new AlertDialog.Builder(que_oneA_no.this);
                        alert.setTitle("Strain/Sprain");

                        WebView wv = new WebView(que_oneA_no.this);
                        wv.loadUrl("http://en.wikipedia.org/wiki/Sprain");
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
                footer.setText("Visit an orthopedics doctor for further evaluation or advice");
            } else if (g.getAns1c().equals("no")) {
                if (g.getAns1d().equals("yes")) {
                    header.setText("The list of possible conditions you might have include\n");
                    tone.setText(Html.fromHtml("<u>Osteoporosis</u> "));
                    tone.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            AlertDialog.Builder alert = new AlertDialog.Builder(que_oneA_no.this);
                            alert.setTitle("Osteoporosis");

                            WebView wv = new WebView(que_oneA_no.this);
                            wv.loadUrl("http://en.wikipedia.org/wiki/Osteoporosis");
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

                    ttwo.setText(Html.fromHtml("<u>Sciatica</u> "));
                    ttwo.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            AlertDialog.Builder alert = new AlertDialog.Builder(que_oneA_no.this);
                            alert.setTitle("Sciatica");

                            WebView wv = new WebView(que_oneA_no.this);
                            wv.loadUrl("http://en.wikipedia.org/wiki/Sciatica");
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

                    tthree.setText(Html.fromHtml("<u>Polymyalgia rheumatica</u> "));
                    tthree.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            AlertDialog.Builder alert = new AlertDialog.Builder(que_oneA_no.this);
                            alert.setTitle("Polymyalgia rheumatica");

                            WebView wv = new WebView(que_oneA_no.this);
                            wv.loadUrl("http://en.wikipedia.org/wiki/Polymyalgia_rheumatica");
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

                    tfour.setText(Html.fromHtml("<u>Spinal stenosis</u> "));
                    tfour.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            AlertDialog.Builder alert = new AlertDialog.Builder(que_oneA_no.this);
                            alert.setTitle("Spinal stenosis");

                            WebView wv = new WebView(que_oneA_no.this);
                            wv.loadUrl("http://en.wikipedia.org/wiki/Spinal_stenosis");
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
                    tfive.setVisibility(View.INVISIBLE);

                    footer.setText("Visit an orthopedics doctor for further evaluation or advice");
                } else if (g.getAns1d().equals("no")) {
                    header.setText("The list of possible conditions you might have include\n");
                    tone.setText(Html.fromHtml("<u>Osteoporosis</u> "));
                    tone.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            AlertDialog.Builder alert = new AlertDialog.Builder(que_oneA_no.this);
                            alert.setTitle("Osteoporosis");

                            WebView wv = new WebView(que_oneA_no.this);
                            wv.loadUrl("http://en.wikipedia.org/wiki/Osteoporosis");
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
                    ttwo.setText(Html.fromHtml("<u>Polymyalgia rheumatica</u> "));
                    ttwo.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            AlertDialog.Builder alert = new AlertDialog.Builder(que_oneA_no.this);
                            alert.setTitle("Polymyalgia rheumatica");

                            WebView wv = new WebView(que_oneA_no.this);
                            wv.loadUrl("http://en.wikipedia.org/wiki/Polymyalgia_rheumatica");
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

                    tthree.setText(Html.fromHtml("<u>Compression fracture</u> "));
                    tthree.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            AlertDialog.Builder alert = new AlertDialog.Builder(que_oneA_no.this);
                            alert.setTitle("Compression fracture");

                            WebView wv = new WebView(que_oneA_no.this);
                            wv.loadUrl("http://en.wikipedia.org/wiki/Vertebral_compression_fracture");
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

                    tfour.setText(Html.fromHtml("<u>Viral disease</u> "));
                    tfour.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            AlertDialog.Builder alert = new AlertDialog.Builder(que_oneA_no.this);
                            alert.setTitle("Viral disease");

                            WebView wv = new WebView(que_oneA_no.this);
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

                    tfive.setText(Html.fromHtml("<u>Strain/Sprain</u> "));
                    tfive.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            AlertDialog.Builder alert = new AlertDialog.Builder(que_oneA_no.this);
                            alert.setTitle("Strain/Sprain");

                            WebView wv = new WebView(que_oneA_no.this);
                            wv.loadUrl("http://en.wikipedia.org/wiki/Sprain");
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
                    footer.setText("Visit an orthopedics doctor for further evaluation or advice");

                }
            }
        } else {
            ques.setVisibility(View.VISIBLE);
            que1dGroup.setVisibility(View.VISIBLE);
            nextButton.setVisibility(View.VISIBLE);
            header.setVisibility(View.INVISIBLE);
            footer.setVisibility(View.INVISIBLE);
            tone.setVisibility(View.INVISIBLE);
            ttwo.setVisibility(View.INVISIBLE);
            tthree.setVisibility(View.INVISIBLE);
            tfour.setVisibility(View.INVISIBLE);
            tfive.setVisibility(View.INVISIBLE);
            ques.setText("Do you have pain in other joints in addition to your back?\n");
            nextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int selectedId = que1dGroup.getCheckedRadioButtonId();
                    if (selectedId == R.id.radio1dYes) {
                        ques.setVisibility(View.INVISIBLE);
                        que1dGroup.setVisibility(View.INVISIBLE);
                        nextButton.setVisibility(View.INVISIBLE);
                        header.setVisibility(View.VISIBLE);
                        footer.setVisibility(View.VISIBLE);
                        tone.setVisibility(View.VISIBLE);
                        ttwo.setVisibility(View.VISIBLE);
                        tthree.setVisibility(View.VISIBLE);
                        tfour.setVisibility(View.VISIBLE);
                        tfive.setVisibility(View.VISIBLE);
                        header.setText("The list of possible conditions you might have include\n");
                        tone.setText(Html.fromHtml("<u>Osteoporosis</u> "));
                        tone.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                AlertDialog.Builder alert = new AlertDialog.Builder(que_oneA_no.this);
                                alert.setTitle("Osteoporosis");

                                WebView wv = new WebView(que_oneA_no.this);
                                wv.loadUrl("http://en.wikipedia.org/wiki/Osteoporosis");
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
                        ttwo.setText(Html.fromHtml("<u>Polymyalgia rheumatica</u> "));
                        ttwo.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                AlertDialog.Builder alert = new AlertDialog.Builder(que_oneA_no.this);
                                alert.setTitle("Polymyalgia rheumatica");

                                WebView wv = new WebView(que_oneA_no.this);
                                wv.loadUrl("http://en.wikipedia.org/wiki/Polymyalgia_rheumatica");
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

                        tthree.setText(Html.fromHtml("<u>Compression fracture</u> "));
                        tthree.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                AlertDialog.Builder alert = new AlertDialog.Builder(que_oneA_no.this);
                                alert.setTitle("Compression fracture");

                                WebView wv = new WebView(que_oneA_no.this);
                                wv.loadUrl("http://en.wikipedia.org/wiki/Vertebral_compression_fracture");
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

                        tfour.setText(Html.fromHtml("<u>Viral disease</u> "));
                        tfour.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                AlertDialog.Builder alert = new AlertDialog.Builder(que_oneA_no.this);
                                alert.setTitle("Viral disease");

                                WebView wv = new WebView(que_oneA_no.this);
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

                        tfive.setText(Html.fromHtml("<u>Strain/Sprain</u> "));
                        tfive.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                AlertDialog.Builder alert = new AlertDialog.Builder(que_oneA_no.this);
                                alert.setTitle("Strain/Sprain");

                                WebView wv = new WebView(que_oneA_no.this);
                                wv.loadUrl("http://en.wikipedia.org/wiki/Sprain");
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
                        footer.setText("Visit an orthopedics doctor for further evaluation or advice");
                    } else {
                        ques.setVisibility(View.INVISIBLE);
                        que1dGroup.setVisibility(View.INVISIBLE);
                        nextButton.setVisibility(View.INVISIBLE);
                        header.setVisibility(View.VISIBLE);
                        footer.setVisibility(View.VISIBLE);
                        tone.setVisibility(View.VISIBLE);
                        ttwo.setVisibility(View.VISIBLE);
                        tthree.setVisibility(View.VISIBLE);
                        tfour.setVisibility(View.VISIBLE);
                        tfive.setVisibility(View.VISIBLE);
                        if ((g.getAns1c().equals("yes") && (g.getAns1d().equals("yes")))) {
                            header.setText("The list of possible conditions you might have include\n");
                            tone.setText(Html.fromHtml("<u>Osteoporosis</u> "));
                            tone.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    AlertDialog.Builder alert = new AlertDialog.Builder(que_oneA_no.this);
                                    alert.setTitle("Osteoporosis");

                                    WebView wv = new WebView(que_oneA_no.this);
                                    wv.loadUrl("http://en.wikipedia.org/wiki/Osteoporosis");
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
                            ttwo.setText(Html.fromHtml("<u>Spinal stenosis</u> "));
                            ttwo.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    AlertDialog.Builder alert = new AlertDialog.Builder(que_oneA_no.this);
                                    alert.setTitle("Spinal stenosis");

                                    WebView wv = new WebView(que_oneA_no.this);
                                    wv.loadUrl("http://en.wikipedia.org/wiki/Spinal_stenosis");
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

                            tthree.setText(Html.fromHtml("<u>Compression fracture</u> "));
                            tthree.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    AlertDialog.Builder alert = new AlertDialog.Builder(que_oneA_no.this);
                                    alert.setTitle("Compression fracture");

                                    WebView wv = new WebView(que_oneA_no.this);
                                    wv.loadUrl("http://en.wikipedia.org/wiki/Vertebral_compression_fracture");
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

                            tfour.setText(Html.fromHtml("<u>Viral disease</u> "));
                            tfour.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    AlertDialog.Builder alert = new AlertDialog.Builder(que_oneA_no.this);
                                    alert.setTitle("Viral disease");

                                    WebView wv = new WebView(que_oneA_no.this);
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

                            tfive.setText(Html.fromHtml("<u>Strain/Sprain</u> "));
                            tfive.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    AlertDialog.Builder alert = new AlertDialog.Builder(que_oneA_no.this);
                                    alert.setTitle("Strain/Sprain");

                                    WebView wv = new WebView(que_oneA_no.this);
                                    wv.loadUrl("http://en.wikipedia.org/wiki/Sprain");
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
                            footer.setText("Visit an orthopedics doctor for further evaluation or advice");
                        } else if ((g.getAns1c().equals("yes") && (g.getAns1d().equals("no")))) {
                            header.setText("The list of possible conditions you might have include\n");
                            footer.setText("Visit an orthopedics doctor for further evaluation or advice");
                            tfive.setVisibility(View.INVISIBLE);
                            tone.setText(Html.fromHtml("<u>Osteoporosis</u> "));
                            tone.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    AlertDialog.Builder alert = new AlertDialog.Builder(que_oneA_no.this);
                                    alert.setTitle("Osteoporosis");

                                    WebView wv = new WebView(que_oneA_no.this);
                                    wv.loadUrl("http://en.wikipedia.org/wiki/Osteoporosis");
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

                            ttwo.setText(Html.fromHtml("<u>Spondylolisthesis</u> "));
                            ttwo.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    AlertDialog.Builder alert = new AlertDialog.Builder(que_oneA_no.this);
                                    alert.setTitle("Spondylolisthesis");

                                    WebView wv = new WebView(que_oneA_no.this);
                                    wv.loadUrl("http://en.wikipedia.org/wiki/Spondylolisthesis");
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

                            tthree.setText(Html.fromHtml("<u>Compression fracture</u> "));
                            tthree.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    AlertDialog.Builder alert = new AlertDialog.Builder(que_oneA_no.this);
                                    alert.setTitle("Compression fracture");

                                    WebView wv = new WebView(que_oneA_no.this);
                                    wv.loadUrl("http://en.wikipedia.org/wiki/Vertebral_compression_fracture");
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
                            tfour.setText(Html.fromHtml("<u>Muscle Spasm</u> "));
                            tfour.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    AlertDialog.Builder alert = new AlertDialog.Builder(que_oneA_no.this);
                                    alert.setTitle("Muscle Spasm");

                                    WebView wv = new WebView(que_oneA_no.this);
                                    wv.loadUrl("http://en.wikipedia.org/wiki/Spasm");
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
                        } else if ((g.getAns1c().equals("no") && (g.getAns1d().equals("yes")))) {
                            header.setText("The list of possible conditions you might have include\n");
                            tone.setText(Html.fromHtml("<u>Osteoporosis</u> "));
                            tone.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    AlertDialog.Builder alert = new AlertDialog.Builder(que_oneA_no.this);
                                    alert.setTitle("Osteoporosis");

                                    WebView wv = new WebView(que_oneA_no.this);
                                    wv.loadUrl("http://en.wikipedia.org/wiki/Osteoporosis");
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
                            ttwo.setText(Html.fromHtml("<u>Degenerative disc disease</u> "));
                            ttwo.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    AlertDialog.Builder alert = new AlertDialog.Builder(que_oneA_no.this);
                                    alert.setTitle("Degenerative disc disease");

                                    WebView wv = new WebView(que_oneA_no.this);
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

                            tthree.setText(Html.fromHtml("<u>Sciatica</u> "));
                            tthree.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    AlertDialog.Builder alert = new AlertDialog.Builder(que_oneA_no.this);
                                    alert.setTitle("Sciatica");

                                    WebView wv = new WebView(que_oneA_no.this);
                                    wv.loadUrl("http://en.wikipedia.org/wiki/Sciatica");
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


                            tfour.setText(Html.fromHtml("<u>Spinal stenosis</u> "));
                            tfour.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    AlertDialog.Builder alert = new AlertDialog.Builder(que_oneA_no.this);
                                    alert.setTitle("Spinal stenosis");

                                    WebView wv = new WebView(que_oneA_no.this);
                                    wv.loadUrl("http://en.wikipedia.org/wiki/Spinal_stenosis");
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

                            tfive.setText(Html.fromHtml("<u>Spasm</u> "));
                            tfive.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    AlertDialog.Builder alert = new AlertDialog.Builder(que_oneA_no.this);
                                    alert.setTitle("Spasm");

                                    WebView wv = new WebView(que_oneA_no.this);
                                    wv.loadUrl("http://en.wikipedia.org/wiki/Spasm");
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

                            footer.setText("Visit an orthopedics doctor for further evaluation or advice");
                        } else if ((g.getAns1c().equals("no") && (g.getAns1d().equals("no")))) {
                            header.setText("The list of possible conditions you might have include\n");
                            footer.setText("Visit an orthopedics doctor for further evaluation or advice");
                            tfour.setVisibility(View.INVISIBLE);
                            tfive.setVisibility(View.INVISIBLE);
                            tone.setText(Html.fromHtml("<u>Osteoporosis</u> "));
                            tone.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    AlertDialog.Builder alert = new AlertDialog.Builder(que_oneA_no.this);
                                    alert.setTitle("Osteoporosis");

                                    WebView wv = new WebView(que_oneA_no.this);
                                    wv.loadUrl("http://en.wikipedia.org/wiki/Osteoporosis");
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
                            ttwo.setText(Html.fromHtml("<u>Spasm</u> "));
                            ttwo.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    AlertDialog.Builder alert = new AlertDialog.Builder(que_oneA_no.this);
                                    alert.setTitle("Spasm");

                                    WebView wv = new WebView(que_oneA_no.this);
                                    wv.loadUrl("http://en.wikipedia.org/wiki/Spasm");
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

                            tthree.setText(Html.fromHtml("<u>Vertebral compression fracture</u> "));
                            tthree.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    AlertDialog.Builder alert = new AlertDialog.Builder(que_oneA_no.this);
                                    alert.setTitle("Vertebral compression fracture");

                                    WebView wv = new WebView(que_oneA_no.this);
                                    wv.loadUrl("http://en.wikipedia.org/wiki/Vertebral_compression_fracture");
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
                        }

                    }
                }
            });

        }

    }


}
