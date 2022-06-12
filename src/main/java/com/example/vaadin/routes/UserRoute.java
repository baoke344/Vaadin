package com.example.vaadin.routes;

import com.example.vaadin.model.User;
import com.example.vaadin.service.UserService;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("")
public class UserRoute extends VerticalLayout {

    public UserRoute(UserService userService) {
        var grid = new Grid<>(User.class);
        grid.setItems(userService.getUsers());

        add(grid);
    }

}
