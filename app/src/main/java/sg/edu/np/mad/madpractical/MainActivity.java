package sg.edu.np.mad.madpractical;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    User u = new User("John", "Lorem ipsum dolor sit amet, consectetur adipiscing " +
            "elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua", 1, false);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView name = findViewById(R.id.username);
        name.setText(u.name);
        TextView des = findViewById(R.id.description);
        des.setText(u.description);

        followStatus();
        Button follow = findViewById(R.id.followButton);
        follow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                followStatus();
            }
        });
    }

    public void followStatus(){
        Button follow = findViewById(R.id.followButton);
        if(u.followed){
            follow.setText("Unfollow");
            u.followed = false;
        } else {
            follow.setText("Follow");
            u.followed = true;
        }
    }
}