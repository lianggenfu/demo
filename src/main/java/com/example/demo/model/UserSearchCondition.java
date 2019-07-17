package com.example.demo.model;

import java.util.Objects;

public class UserSearchCondition {

    private int start;

    private int limit;

    private String searchText="";

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public String getSearchText() {
        return searchText;
    }

    public void setSearchText(String searchText) {
        this.searchText = searchText;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserSearchCondition that = (UserSearchCondition) o;
        return start == that.start &&
                limit == that.limit &&
                Objects.equals(searchText, that.searchText);
    }

    @Override
    public int hashCode() {
        return Objects.hash(start, limit, searchText);
    }
}
