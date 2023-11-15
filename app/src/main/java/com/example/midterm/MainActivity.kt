package com.example.midterm

import UserViewModel
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel



@Composable
fun UserList(userViewModel: UserViewModel = viewModel()) {
    //TODO
}


@Composable
fun UserItem(user: User) {
    Text(text = "Name: ${user.name}, Username: ${user.username}")
}

@Composable
fun FeatherAndroidTasksTheme(content: @Composable () -> Unit) {
    MaterialTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
        ) {
            content()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun UserListPreview() {
    FeatherAndroidTasksTheme {
        UserList()
    }
}

@Preview(showBackground = true)
@Composable
fun UserItemPreview() {
    FeatherAndroidTasksTheme {
        UserItem(User(1, "John Doe", "johndoe"))
    }
}

class MainActivity : ComponentActivity() {
    private val userViewModel: UserViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FeatherAndroidTasksTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                ) {
                    UserList(userViewModel)
                }
            }
        }
    }
}
