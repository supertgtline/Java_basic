package com.filter;

import java.util.List;

public interface Filter {

    List<Purse> meetFilter(List<Purse> purses);
}
