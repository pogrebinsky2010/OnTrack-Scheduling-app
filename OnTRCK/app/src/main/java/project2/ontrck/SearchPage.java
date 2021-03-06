package project2.ontrck;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by talaba on 5/16/17.
 */

public class SearchPage extends AppCompatActivity {
    // this class has not been put into the main project because it simply takes input and
    // hasnt been implemented to manipulate and search yet
    // this class is just a work in progress
    // one could easily just grab preferences then navigate through the array and find the inputed input
    // then they would need to implement a display page


    String eventName;
    EditText eventInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_page);
        eventInput = (EditText)findViewById(R.id.event_input);

        Button searchButton = (Button) findViewById(R.id.search_button);
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eventName = eventInput.getText().toString();

                searchButtonPressed(eventName);
            }
        });
    }

    public void searchButtonPressed(String eventName){

        if(eventName.matches("")) {
            Toast.makeText(getApplicationContext(),"Please enter a event",Toast.LENGTH_SHORT).show();
        }
        else{
            //data.searchEvent(eventName);
        }
    }
}

