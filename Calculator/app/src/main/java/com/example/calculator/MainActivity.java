package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView pheptoan, ketqua, so1, so2, so3, so4, so5, so6, so7, so8, so9, so0;
    ImageView phantram, ce, c, del, motchiax, xbinh, canx, chia, nhan, cong, tru, doidau, cham, bang;

    Boolean isCalculator = false;
    Boolean isSub = false;
    Boolean isAdd = false;
    Boolean isDiv = false;
    Boolean isMul = false;

    Double a, b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pheptoan = findViewById(R.id.note);
        ketqua = findViewById(R.id.result);

        so0 = findViewById(R.id.so0);
        so1 = findViewById(R.id.so1);
        so2 = findViewById(R.id.so2);
        so3 = findViewById(R.id.so3);
        so4 = findViewById(R.id.so4);
        so5 = findViewById(R.id.so5);
        so6 = findViewById(R.id.so6);
        so7 = findViewById(R.id.so7);
        so8 = findViewById(R.id.so8);
        so9 = findViewById(R.id.so9);

        phantram = findViewById(R.id.phantram);
        ce = findViewById(R.id.ce);
        c = findViewById(R.id.c);
        del = findViewById(R.id.del);
        motchiax = findViewById(R.id.motchiax);
        xbinh = findViewById(R.id.xbinh);
        canx = findViewById(R.id.canx);
        chia = findViewById(R.id.chia);
        nhan = findViewById(R.id.nhan);
        cong = findViewById(R.id.cong);
        tru = findViewById(R.id.tru);
        doidau = findViewById(R.id.duongam);
        cham = findViewById(R.id.cham);
        bang = findViewById(R.id.bang);

        Boolean isBang = false, isCham = false;

        so0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isBang) {
                    String tinhToan = ketqua.getText().toString();
                    if(tinhToan.equals("0")){
                        ketqua.setText("0");
                    } else {
                        ketqua.setText(tinhToan + "0");
                    }
                }
            }
        });

        so1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isBang) {
                    String tinhToan = ketqua.getText().toString();
                    if(tinhToan.equals("0")){
                        ketqua.setText("1");
                    } else {
                        ketqua.setText(tinhToan + "1");
                    }
                }
            }
        });

        so2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isBang) {
                    String tinhToan = ketqua.getText().toString();
                    if(tinhToan.equals("0")){
                        ketqua.setText("2");
                    } else {
                        ketqua.setText(tinhToan + "2");
                    }
                }
            }
        });

        so3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isBang) {
                    String tinhToan = ketqua.getText().toString();
                    if(tinhToan.equals("0")){
                        ketqua.setText("3");
                    } else {
                        ketqua.setText(tinhToan + "3");
                    }
                }
            }
        });

        so4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isBang) {
                    String tinhToan = ketqua.getText().toString();
                    if(tinhToan.equals("0")){
                        ketqua.setText("4");
                    } else {
                        ketqua.setText(tinhToan + "4");
                    }
                }
            }
        });

        so5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isBang) {
                    String tinhToan = ketqua.getText().toString();
                    if(tinhToan.equals("0")){
                        ketqua.setText("5");
                    } else {
                        ketqua.setText(tinhToan + "5");
                    };
                }
            }
        });

        so6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isBang) {
                    String tinhToan = ketqua.getText().toString();
                    if(tinhToan.equals("0")){
                        ketqua.setText("6");
                    } else {
                        ketqua.setText(tinhToan + "6");
                    }
                }
            }
        });

        so7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isBang) {
                    String tinhToan = ketqua.getText().toString();
                    if(tinhToan.equals("0")){
                        ketqua.setText("7");
                    } else {
                        ketqua.setText(tinhToan + "7");
                    }
                }
            }
        });

        so8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isBang) {
                    String tinhToan = ketqua.getText().toString();
                    if(tinhToan.equals("0")){
                        ketqua.setText("8");
                    } else {
                        ketqua.setText(tinhToan + "8");
                    }
                }
            }
        });

        so9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isBang) {
                    String tinhToan = ketqua.getText().toString();
                    if(tinhToan.equals("0")){
                        ketqua.setText("9");
                    } else {
                        ketqua.setText(tinhToan + "9");
                    }
                }
            }
        });

        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = ketqua.getText().toString();
                if (str.length() > 0 && (str.equals("0") == false)) {
                    str = str.substring(0, str.length() - 1);
                    ketqua.setText(str);
                } else {
                    ketqua.setText(str);
                } if (str.equals("")) {
                    ketqua.setText("0");
                }
            }
        });

        cham.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isBang) {
                    if(!isCham) {
                        String tinhToan = ketqua.getText().toString();
                        if(tinhToan.equals("0")){
                            ketqua.setText("0");
                        } else if(tinhToan.contains(".")) {
                            ketqua.setText(tinhToan);
                        } else {
                            ketqua.setText(tinhToan + ".");
                        }
                    }
                }
            }
        });

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isCalculator) {
                    ketqua.setText("0");
                } else {
                    pheptoan.setText("");
                    isCalculator = false;
                    ketqua.setText("0");
                }
            }
        });

        ce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isCalculator) {
                    ketqua.setText("0");
                } else {
                    pheptoan.setText("");
                    isCalculator = false;
                    ketqua.setText("0");
                }
            }
        });

        nhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Double.parseDouble(ketqua.getText().toString());
                isCalculator = true;
                isMul = true;
                pheptoan.setText(a + " x ");
                ketqua.setText("0");
            }
        });

        chia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Double.parseDouble(ketqua.getText().toString());
                isCalculator = true;
                isDiv = true;
                pheptoan.setText(a + " / ");
                ketqua.setText("0");
            }
        });

        cong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Double.parseDouble(ketqua.getText().toString());
                isCalculator = true;
                isAdd = true;
                pheptoan.setText(a + " + ");
                ketqua.setText("0");
            }
        });

        tru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Double.parseDouble(ketqua.getText().toString());
                isCalculator = true;
                isSub = true;
                pheptoan.setText(a + " - ");
                ketqua.setText("0");
            }
        });

        phantram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double pt = Double.parseDouble(ketqua.getText().toString());
                pheptoan.setText(ketqua.getText().toString() + "%");
                ketqua.setText((pt / 100) + "");
            }
        });

        motchiax.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double pt = Double.parseDouble(ketqua.getText().toString());
                pheptoan.setText("1/(" + ketqua.getText().toString() + ")");
                ketqua.setText((1 / pt) + "");
            }
        });

        xbinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double pt = Double.parseDouble(ketqua.getText().toString());
                pheptoan.setText(ketqua.getText().toString() + " ^ 2");
                ketqua.setText((pt * pt) + "");
            }
        });

        canx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double pt = Double.parseDouble(ketqua.getText().toString());
                pheptoan.setText("sqrt(" + ketqua.getText().toString() + ")");
                ketqua.setText(Math.sqrt(pt) + "");
            }
        });

        bang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b = Double.parseDouble(ketqua.getText().toString());
                pheptoan.setText(pheptoan.getText().toString() + b + " = ");

                if(isSub) {
                    Double x = a - b;
                    ketqua.setText(String.valueOf(x));
                    isSub = false;
                } else if(isAdd) {
                    Double x = a + b;
                    ketqua.setText(String.valueOf(x));
                    isAdd = false;
                } else if(isMul) {
                    Double x = a * b;
                    ketqua.setText(String.valueOf(x));
                    isMul = false;
                } else if(isDiv) {
                    Double x = a / b;
                    ketqua.setText(String.valueOf(x));
                    isDiv= false;
                }
                isCalculator = false;
                a = 0.0;
                b = 0.0;
            }
        });

    }

}