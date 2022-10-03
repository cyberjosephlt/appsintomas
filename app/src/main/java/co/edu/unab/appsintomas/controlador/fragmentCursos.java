package co.edu.unab.appsintomas.controlador;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import co.edu.unab.appsintomas.R;
import co.edu.unab.appsintomas.entities.cursos;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link fragmentCursos#newInstance} factory method to
 * create an instance of this fragment.
 */
public class fragmentCursos extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private ArrayList<cursos> cursolist = new ArrayList<>();
    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private ListView listview;
    //private ArrayList<String> textos;
    public fragmentCursos() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment fragmentCursos.
     */
    // TODO: Rename and change types and number of parameters
    public static fragmentCursos newInstance(String param1, String param2) {
        fragmentCursos fragment = new fragmentCursos();
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
        View root=inflater.inflate(R.layout.fragment_cursos, container, false);


        ArrayList <String> artest=new ArrayList<String>();

        artest.add("1");
        listview = (ListView) root.findViewById(R.id.listacursos);
        cursos cursosn1= new cursos("1234","MATEMATICAS DISCRETAS","0101","0202","DIURNA");
        cursos cursosn2= new cursos("4321","ALGEBRA LINEA","03013","0404","TARDE");
        cursos cursosn3= new cursos("5466","SISTEMAS OPERATIVOS","03013","0404","TARDE");
        cursos cursosn4= new cursos("0125","INTELIGENCIA ARTIFICIAL","03013","0404","TARDE");
        cursos cursosn5= new cursos("4345","ALGORITMOS","03013","0404","TARDE");
        cursolist.add(cursosn1);
        cursolist.add(cursosn2);
        cursolist.add(cursosn3);
        cursolist.add(cursosn4);
        cursolist.add(cursosn5);

        /*textos = new ArrayList<St""ring>();
        textos .add("MATEMATICAS DISCRETAS");
        textos .add("ALGEBRA LINEAL");
        textos .add("SISTEMAS OPERATIVOS");
        textos .add("INTELIGENCIA ARTIFICIAL");
        textos .add("ALGORITMOS");*/

        ArrayAdapter<cursos> adapter = new ArrayAdapter<cursos>(getContext(),
                android.R.layout.simple_list_item_1,
                cursolist);
        listview.setAdapter(adapter);

        return root;
    }







}