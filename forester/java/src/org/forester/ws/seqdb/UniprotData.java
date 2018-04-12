
package org.forester.ws.seqdb;

import java.io.IOException;

public final class UniprotData {

    final String _id;
    final String _entry;
    final String _entry_name;
    final String _status;
    final String _protein_names;
    final String _gene_names;
    final String _organism;
    final int    _length;

    public UniprotData( final String line ) throws IOException {
        final String[] split_line = line.split( "\t" );
        if ( split_line.length != 9 ) {
            throw new IOException( "line has illegal format: " + line );
        }
        _id = split_line[ 0 ];
        _entry = split_line[ 2 ];
        _entry_name = split_line[ 3 ];
        _status = split_line[ 4 ];
        _protein_names = split_line[ 5 ];
        _gene_names = split_line[ 6 ];
        _organism = split_line[ 7 ];
        try {
            _length = Integer.parseInt( split_line[ 8 ] );
        }
        catch ( final NumberFormatException e ) {
            throw new IOException( "could not parse length from " + split_line[ 8 ] );
        }
    }

    public String getId() {
        return _id;
    }

    public String getEntry() {
        return _entry;
    }

    public String getEntryName() {
        return _entry_name;
    }

    public String getStatus() {
        return _status;
    }

    public String getProteinNames() {
        return _protein_names;
    }

    public String getGeneNames() {
        return _gene_names;
    }

    public String getOrganism() {
        return _organism;
    }

    public int getLength() {
        return _length;
    }
}