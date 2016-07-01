package ga.demo.viewslab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button mButton1;
    Button mButton2;
    Button mButton3;
    Button mButton4;
    Button mButton5;
    Button mButton6;
    Button mButton7;
    Button mButton8;
    Button mButton9;
    Button mButton10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mButton1 = (Button) findViewById(R.id.buttonPress12);
        Button mButton2 = (Button) findViewById(R.id.buttonPress34);
        Button mButton3 = (Button) findViewById(R.id.buttonPress56);
        Button mButton4 = (Button) findViewById(R.id.buttonPress78);
        Button mButton5 = (Button) findViewById(R.id.buttonPress910);
        Button mButton6 = (Button) findViewById(R.id.buttonPress1112);
        Button mButton7 = (Button) findViewById(R.id.buttonPress1314);
        Button mButton8 = (Button) findViewById(R.id.buttonPress1516);
        Button mButton9 = (Button) findViewById(R.id.buttonPress1718);
        Button mButton10 = (Button) findViewById(R.id.buttonPress1920);


        Button.OnClickListener clickListener = new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.buttonPress12:
                        Toast.makeText(view.getContext(), "You clicked on the button below views "
                                + "number 1 and 2", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.buttonPress34:
                        Toast.makeText(view.getContext(), "You clicked on the button below views "
                                + "number 3 and 4", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.buttonPress56:
                        Toast.makeText(view.getContext(), "You clicked on the button below views "
                                + "number 5 and 6", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.buttonPress78:
                        Toast.makeText(view.getContext(), "You clicked on the button below views "
                                + "number 7 and 8", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.buttonPress910:
                        Toast.makeText(view.getContext(), "You clicked on the button below views "
                                + "number 9 and 10", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.buttonPress1112:
                        Toast.makeText(view.getContext(), "You clicked on the button below views "
                                + "number 11 and 12", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.buttonPress1314:
                        Toast.makeText(view.getContext(), "You clicked on the button below views "
                                + "number 13 and 14", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.buttonPress1516:
                        Toast.makeText(view.getContext(), "You clicked on the button below views "
                                + "number 15 and 16", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.buttonPress1718:
                        Toast.makeText(view.getContext(), "You clicked on the button below views "
                                + "number 17 and 18", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.buttonPress1920:
                        Toast.makeText(view.getContext(), "You clicked on the button below views "
                                + "number 19 and 20", Toast.LENGTH_SHORT).show();
                        break;

                    default:
                        Toast.makeText(view.getContext(), "You made a mistake, or I did",
                                Toast.LENGTH_SHORT).show();

                }
            }

        };

        mButton1.setOnClickListener(clickListener);
        mButton2.setOnClickListener(clickListener);
        mButton3.setOnClickListener(clickListener);
        mButton4.setOnClickListener(clickListener);
        mButton5.setOnClickListener(clickListener);
        mButton6.setOnClickListener(clickListener);
        mButton7.setOnClickListener(clickListener);
        mButton8.setOnClickListener(clickListener);
        mButton9.setOnClickListener(clickListener);
        mButton10.setOnClickListener(clickListener);

    }
}
