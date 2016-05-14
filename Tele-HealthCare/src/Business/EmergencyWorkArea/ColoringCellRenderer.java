/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.EmergencyWorkArea;

import java.awt.Color;
import java.awt.Component;
import java.awt.Point;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Neelu
 */
class ColoringCellRenderer extends DefaultTableCellRenderer
{
    private final Set<Point> highlightedCells = new HashSet<Point>();

    void setHighlighted(int r, int c, boolean highlighted)
    {
        if (highlighted)
        {
            highlightedCells.add(new Point(r,c));
        }
        else
        {
            highlightedCells.remove(new Point(r,c));
        }
    }

    private boolean isHighlighted(int r, int c)
    {
        return highlightedCells.contains(new Point(r,c));
    }

    public Component getTableCellRendererComponent(JTable table, Object value,
        boolean isSelected, boolean hasFocus, int row, int column)
    {

        if (isHighlighted(row,  column))
        {
            setForeground(Color.BLACK);
            setBackground(Color.RED);
        }
        else
        {
            setForeground(Color.BLACK);
            setBackground(Color.WHITE);
        }
        return this;
    }
}