package co.edu.unab.appsintomas.controlador;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import co.edu.unab.appsintomas.R;
import co.edu.unab.appsintomas.entities.cursos;
import co.edu.unab.appsintomas.entities.usuario;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link fragmentDocentes#newInstance} factory method to
 * create an instance of this fragment.
 */
public class fragmentDocentes extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private ListView listview;
    private ArrayList<String> textos;
    private ArrayList<usuario> docentelist = new ArrayList<usuario>();
    public fragmentDocentes() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment fragmentDocentes.
     */
    // TODO: Rename and change types and number of parameters
    public static fragmentDocentes newInstance(String param1, String param2) {
        fragmentDocentes fragment = new fragmentDocentes();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root=inflater.inflate(R.layout.fragment_docentes, container, false);
        listview = (ListView) root.findViewById(R.id.listadodocentes);
        usuario user= new usuario("1234","Bruce Banner"
                ,"HUlk","enojado2022","CE",56474,
                "https://upload.wikimedia.org/wikipedia/en/thumb/3/3b/Mark_Ruffalo_as_%22Professor_Hulk%22.jpeg/1280px-Mark_Ruffalo_as_%22Professor_Hulk%22.jpeg",
                "habilitado","DOCENTE");

        docentelist.add(user);
        ArrayAdapter<usuario> adapter = new ArrayAdapter<usuario>(getContext(),
                android.R.layout.simple_list_item_1,
                docentelist);
        listview.setAdapter(adapter);


        return root;
    }
}