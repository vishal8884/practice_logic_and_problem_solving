



/*

1) while(start < end) it does not find target as start < end ...we need to use this when we dont want to find target

eg ->     if(grid[row][mid] >= 0) {
					start = start + 1;
				}
				else {
				    end = end -1;      // at last end decrease because it satifies this case and points to the last positive no
				}


*/