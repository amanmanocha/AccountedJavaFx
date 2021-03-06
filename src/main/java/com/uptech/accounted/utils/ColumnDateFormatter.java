package com.uptech.accounted.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javafx.scene.control.Label;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.util.Callback;

public class ColumnDateFormatter<S, T> implements Callback<TableColumn<S, T>, TableCell<S, T>> {

    private final DateTimeFormatter format;

    public ColumnDateFormatter(DateTimeFormatter format) {
        super();
        this.format = format;
    }

    @Override
    public TableCell<S, T> call(TableColumn<S, T> arg0) {
        return new TableCell<S, T>() {
            @Override
            protected void updateItem(T item, boolean empty) {
                super.updateItem(item, empty);
                if (item == null || empty) {
                    setGraphic(null);
                } else {
                    LocalDate ld = (LocalDate) item;
                    String val = ld.format(format);
                    setGraphic(new Label(val));
                }
            }
        };
    }
}